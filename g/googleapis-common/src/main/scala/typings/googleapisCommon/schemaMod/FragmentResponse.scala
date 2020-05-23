package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.anon.Fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentResponse extends js.Object {
  var codeFragment: StringDictionary[Fragment]
}

object FragmentResponse {
  @scala.inline
  def apply(codeFragment: StringDictionary[Fragment]): FragmentResponse = {
    val __obj = js.Dynamic.literal(codeFragment = codeFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentResponse]
  }
}

