package hello.world

import org.scalablytyped.runtime.{Instantiable1, Instantiable2}
import slinky.core.BuildingComponent

import scala.scalajs.js

object ScalableSlinky {
  import typings.reactLib.reactMod._

  import scala.language.implicitConversions

  @inline implicit def fromExoticComponent[P <: js.Object](c: ExoticComponent[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromComponentClass[P <: js.Object](c: ComponentClass[P, _]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromInstantiable1[P <: js.Object](c: Instantiable1[P, ReactElement[_]]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromInstantiable2[P <: js.Object](c: Instantiable2[P, _, ReactElement[_]]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromComponentType[P <: js.Object](c: ComponentType[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])
  @inline implicit def fromFc[P <: js.Object](c: FunctionComponent[P]): AwaitProps[P] = new AwaitProps[P](c.asInstanceOf[ComponentType[P]])

  @inline final class AwaitProps[P <: js.Object](private val ctor: ComponentType[P]) extends AnyVal {
    @inline def props(props: P): BuildingComponent[Nothing, js.Object] =
      new BuildingComponent(js.Array(ctor.asInstanceOf[js.Any], props))

    @inline def noprops: BuildingComponent[Nothing, js.Object] =
      new BuildingComponent(js.Array(ctor.asInstanceOf[js.Any], new js.Object))
  }
}
