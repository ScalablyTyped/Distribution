package typings.expressFlash.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Express extends js.Object {
    @js.native
    trait Request extends js.Object {
      def flash(): StringDictionary[js.Array[String]] = js.native
      def flash(event: String, message: String): js.Any = js.native
      def flash(event: String, message: js.Array[String]): js.Any = js.native
      def flash(message: String): StringDictionary[js.Array[String]] = js.native
    }
    
  }
  
}

