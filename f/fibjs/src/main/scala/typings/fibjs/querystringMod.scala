package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief http query 处理模块
  * @detail 引用方法：,```JavaScript,var querystring = require('querystring');,```
  */
object querystringMod {
  
  @JSImport("querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(str: String): ClassHttpCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: String): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: String, eq: String): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: String, eq: String, opt: js.Object): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: String, eq: Unit, opt: js.Object): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: Unit, eq: String): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: Unit, eq: String, opt: js.Object): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  @scala.inline
  def parse(str: String, sep: Unit, eq: Unit, opt: js.Object): ClassHttpCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ClassHttpCollection]
  
  @scala.inline
  def stringify(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: String, eq: String, opt: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: String, eq: Unit, opt: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: Unit, eq: String, opt: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Object, sep: Unit, eq: Unit, opt: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
