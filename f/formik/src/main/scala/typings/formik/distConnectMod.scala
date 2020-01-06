package typings.formik

import typings.formik.distTypesMod.FormikContext
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object distConnectMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(FormikConsumer) */ val FormikProvider: ProviderExoticComponent[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with Anon_FormikFormikContext[Values]]): ComponentType[OuterProps] = js.native
}

