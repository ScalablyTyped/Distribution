package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("url")
@js.native
object urlNs extends js.Object {
  /**
    * <p>A utility function to split a URL into parts</p>
    * <p>This is useful in web servers for instance when handling a request.</p>
    * <p>For instance <code>url.parse(&quot;/a?b=c&amp;d=e&quot;,true)</code> returns <code>{&quot;method&quot;:&quot;GET&quot;,&quot;host&quot;:&quot;&quot;,&quot;path&quot;:&quot;/a?b=c&amp;d=e&quot;,&quot;pathname&quot;:&quot;/a&quot;,&quot;search&quot;:&quot;?b=c&amp;d=e&quot;,&quot;port&quot;:80,&quot;query&quot;:{&quot;b&quot;:&quot;c&quot;,&quot;d&quot;:&quot;e&quot;}}</code></p>
    * 
    * @param urlStr 
    * @param parseQuery 
    * @return  
    * @url http://www.espruino.com/Reference#l_url_parse
    */
  def parse(urlStr: js.Any, parseQuery: scala.Boolean): js.Any = js.native
}

