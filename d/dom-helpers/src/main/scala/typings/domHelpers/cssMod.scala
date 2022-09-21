package typings.domHelpers

import typings.domHelpers.anon.PartialRecordPropertystri
import typings.domHelpers.typesMod.CamelProperty
import typings.domHelpers.typesMod.HyphenProperty
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("dom-helpers/cjs/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement, property: PartialRecordPropertystri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string & {} | 0, string & {}>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string & {} | 0, string & {}>[T] */ js.Any]
  
  inline def default_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string & {} | 0, string & {}>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string & {} | 0, string & {}>[T] */ js.Any]
}
