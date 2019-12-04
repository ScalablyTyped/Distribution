package typings.fastDashCsv.buildSrcParserParserScannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenArgs extends js.Object {
  var endCursor: Double
  var startCursor: Double
  var token: String
}

object TokenArgs {
  @scala.inline
  def apply(endCursor: Double, startCursor: Double, token: String): TokenArgs = {
    val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenArgs]
  }
}

