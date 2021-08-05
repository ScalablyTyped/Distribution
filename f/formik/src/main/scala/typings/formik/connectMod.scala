package typings.formik

import typings.formik.anon.Formik
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("formik/dist/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[OuterProps, Values](Comp: ComponentType[OuterProps & Formik[Values]]): ComponentType[OuterProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Comp.asInstanceOf[js.Any]).asInstanceOf[ComponentType[OuterProps]]
}
