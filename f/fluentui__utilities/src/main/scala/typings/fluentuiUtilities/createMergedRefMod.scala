package typings.fluentuiUtilities

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMergedRefMod {
  
  @JSImport("@fluentui/utilities/lib/createMergedRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMergedRef[TType, TValue](): js.Function1[
    /* repeated */ js.UndefOr[Ref[TType | TValue | Null]], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMergedRef")().asInstanceOf[js.Function1[
    /* repeated */ js.UndefOr[Ref[TType | TValue | Null]], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ]]
  inline def createMergedRef[TType, TValue](value: TValue): js.Function1[
    /* repeated */ js.UndefOr[Ref[TType | TValue | Null]], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMergedRef")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* repeated */ js.UndefOr[Ref[TType | TValue | Null]], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ]]
}
