package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief url 处理模块
  * @detail 
  */
object urlMod {
  
  @JSImport("url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(args: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(url: String): ClassUrlObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[ClassUrlObject]
  inline def parse(url: String, parseQueryString: Boolean): ClassUrlObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[ClassUrlObject]
  inline def parse(url: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): ClassUrlObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[ClassUrlObject]
  inline def parse(url: String, parseQueryString: Unit, slashesDenoteHost: Boolean): ClassUrlObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[ClassUrlObject]
}
