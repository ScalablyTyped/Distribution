package typings.reactLib

import org.scalablytyped.runtime.{Instantiable1, Instantiable2}
import slinky.core.{BuildingComponent, KeyAddingStage, KeyAndRefAddingStage, WithAttrs}
import typings.reactLib.reactMod._

import scala.language.implicitConversions
import scala.scalajs.js

object ScalableSlinky {
  /* Support using ScalablyTyped components as slinky ExternalComponents */
  @inline implicit def fromExoticComponent[P <: js.Object](c: ExoticComponent[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromComponentClass[P <: js.Object](c: ComponentClass[P, _]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromInstantiable1[P <: js.Object](c: Instantiable1[P, ReactElement]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromInstantiable2[P <: js.Object](c: Instantiable2[P, _, ReactElement]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromComponentType[P <: js.Object](c: ComponentType[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromFc[P <: js.Object](c: FunctionComponent[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])

  @inline final class AwaitProps[P <: js.Object](private val ctor: ComponentType[P]) extends AnyVal {
    @inline def props(props: P): BuildingComponent[Nothing, js.Object] =
      new BuildingComponent(js.Array(ctor.asInstanceOf[js.Any], props))

    @inline def noprops: BuildingComponent[Nothing, js.Object] =
      new BuildingComponent(js.Array(ctor.asInstanceOf[js.Any], new js.Object))
  }

  /* Support using Slinky things when a ScalablyTyped `ReactNode` is expected */
  @inline implicit def buildExternal[E, R <: js.Object](comp: BuildingComponent[E, R]): ReactNode =
    BuildingComponent.make[E, R](comp).asInstanceOf[ReactNode]

  @inline implicit def buildWithAttrs[A](withAttrs: WithAttrs[A]): ReactNode =
    WithAttrs.build(withAttrs).asInstanceOf[ReactNode]

  @inline implicit def buildKeyAddingState(stage: KeyAddingStage): ReactNode =
    KeyAddingStage.build(stage).asInstanceOf[ReactNode]

  @inline implicit def buildKeyAndRefAddingStage[D](stage: KeyAndRefAddingStage[D]): ReactNode =
    KeyAndRefAddingStage.build(stage).asInstanceOf[ReactNode]
}
