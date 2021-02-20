package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief url 处理模块
  * @detail 
  */
object urlMod {
  
  @JSImport("url", "format")
  @js.native
  def format(args: js.Object): String = js.native
  
  @JSImport("url", "parse")
  @js.native
  def parse(url: String): ClassUrlObject = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(url: String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): ClassUrlObject = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(url: String, parseQueryString: Boolean): ClassUrlObject = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(url: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): ClassUrlObject = js.native
}
