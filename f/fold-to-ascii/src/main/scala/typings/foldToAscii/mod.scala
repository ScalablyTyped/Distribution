package typings.foldToAscii

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fold-to-ascii", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def foldMaintaining(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMaintaining")().asInstanceOf[String]
  @scala.inline
  def foldMaintaining(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMaintaining")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def foldReplacing(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")().asInstanceOf[String]
  @scala.inline
  def foldReplacing(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def foldReplacing(str: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def foldReplacing(str: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
}
