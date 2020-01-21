package typings.formik

import typings.formik.typesMod.FormikContext
import typings.react.mod.ComponentType
import typings.react.mod.ProviderExoticComponent
import typings.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(FormikConsumer) */ val FormikProvider: ProviderExoticComponent[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with AnonFormikFormikContext[Values]]): ComponentType[OuterProps] = js.native
}

