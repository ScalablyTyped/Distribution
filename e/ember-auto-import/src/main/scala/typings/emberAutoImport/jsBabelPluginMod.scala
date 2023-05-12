package typings.emberAutoImport

import typings.emberAutoImport.anon.Inherits
import typings.emberAutoImport.anon.TypeofBabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsBabelPluginMod {
  
  inline def apply(babel: TypeofBabel): Inherits = ^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any]).asInstanceOf[Inherits]
  
  @JSImport("ember-auto-import/js/babel-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember-auto-import/js/babel-plugin", "baseDir")
  @js.native
  def baseDir: js.Function0[String] = js.native
  inline def baseDir_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(x.asInstanceOf[js.Any])
}
