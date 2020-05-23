package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAuthHeaderValueForFirstParty extends js.Object {
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null
}

object GetAuthHeaderValueForFirstParty {
  @scala.inline
  def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => String | Null): GetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal(getAuthHeaderValueForFirstParty = js.Any.fromFunction1(getAuthHeaderValueForFirstParty))
    __obj.asInstanceOf[GetAuthHeaderValueForFirstParty]
  }
}

