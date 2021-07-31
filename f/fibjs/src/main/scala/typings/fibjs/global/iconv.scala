package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconv {
  
  @JSGlobal("__iconv")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(charset: String, data: typings.fibjs.ClassBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def encode(charset: String, data: String): typings.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.fibjs.ClassBuffer]
  
  @scala.inline
  def isEncoding(charset: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(charset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
