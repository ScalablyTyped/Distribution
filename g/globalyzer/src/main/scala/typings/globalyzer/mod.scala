package typings.globalyzer

import typings.globalyzer.anon.Base
import typings.globalyzer.anon.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(glob: String): Base = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Base]
  @scala.inline
  def apply(glob: String, options: Strict): Base = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Base]
  
  @JSImport("globalyzer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
