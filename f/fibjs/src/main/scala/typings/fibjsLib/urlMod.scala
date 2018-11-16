package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief url 处理模块
	* @detail 
	*/
@JSImport("url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  def format(args: js.Object): java.lang.String = js.native
  def parse(url: java.lang.String): fibjsLib.Class_UrlObject = js.native
  def parse(url: java.lang.String, parseQueryString: scala.Boolean): fibjsLib.Class_UrlObject = js.native
  def parse(url: java.lang.String, parseQueryString: scala.Boolean, slashesDenoteHost: scala.Boolean): fibjsLib.Class_UrlObject = js.native
}

