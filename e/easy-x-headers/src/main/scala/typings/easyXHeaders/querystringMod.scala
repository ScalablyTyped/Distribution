package typings.easyXHeaders

import typings.easyXHeaders.anon.MaxKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  @JSImport("querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: String, eq: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: String, eq: String, options: MaxKeys): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: String, eq: Unit, options: MaxKeys): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: Unit, eq: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: Unit, eq: String, options: MaxKeys): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String, sep: Unit, eq: Unit, options: MaxKeys): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def stringify(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
