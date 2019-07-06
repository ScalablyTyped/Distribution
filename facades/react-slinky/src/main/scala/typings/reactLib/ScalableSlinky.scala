package typings.reactLib

import org.scalablytyped.runtime.{Instantiable1, Instantiable2}
import slinky.core.{
  BuildingComponent,
  ExternalComponent,
  KeyAddingStage,
  KeyAndRefAddingStage,
  TagMod,
  WithAttrs,
  facade => S
}
import typings.reactLib.{reactMod => ST}

import scala.language.implicitConversions
import scala.scalajs.js

object ScalableSlinky {

  /* Does this not exist? Am i completely blind? */
  trait ExternalComponentP[P] extends ExternalComponent {
    type Props = P
  }

  /**
   * Support using ScalablyTyped components as slinky ExternalComponents
   *
   * We hide this behind an object, because it's meant for facade authors primarily
   */
  object importSTComponent {
    @inline def apply[P <: js.Object](c: ST.ExoticComponent[P]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }

    @inline def apply[P <: js.Object](c: ST.ComponentClass[P, _]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }

    @inline def apply[P <: js.Object](c: Instantiable1[P, ST.ReactElement]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }

    @inline def apply[P <: js.Object](c: Instantiable2[P, _, ST.ReactElement]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }

    @inline def apply[P <: js.Object](c: ST.ComponentType[P]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }

    @inline def apply[P <: js.Object](c: ST.FunctionComponent[P]): ExternalComponentP[P] =
      new ExternalComponentP[P] {
        override val component = c.asInstanceOf[js.Object]
      }
  }

  @inline implicit final class FromStReactNode(val node: ST.ReactNode) {
    @inline def fromST: TagMod[Any] = node.asInstanceOf[TagMod[Any]]
  }

  /* Support using Slinky things when a ScalablyTyped `ReactElement` is expected */
  @inline implicit final class ToStReactElement(val elem: S.ReactElement) extends AnyVal {
    @inline def toST: ST.ReactElement = elem.asInstanceOf[ST.ReactElement]
  }

  @inline implicit def buildExternal[E, R <: js.Object](comp: BuildingComponent[E, R]): ToStReactElement =
    new ToStReactElement(BuildingComponent.make[E, R](comp))

  @inline implicit def buildWithAttrs[A](withAttrs: WithAttrs[A]): ToStReactElement =
    new ToStReactElement(WithAttrs.build(withAttrs))

  @inline implicit def buildKeyAddingState(stage: KeyAddingStage): ToStReactElement =
    new ToStReactElement(KeyAddingStage.build(stage))

  @inline final implicit def buildKeyAndRefAddingStage[D](stage: KeyAndRefAddingStage[D]): ToStReactElement =
    new ToStReactElement(KeyAndRefAddingStage.build(stage))
}
