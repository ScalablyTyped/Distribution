package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAuthHeaderValueForFirstParty extends js.Object {
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null
}

object AnonGetAuthHeaderValueForFirstParty {
  @scala.inline
  def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => String | Null): AnonGetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal(getAuthHeaderValueForFirstParty = js.Any.fromFunction1(getAuthHeaderValueForFirstParty))
  
    __obj.asInstanceOf[AnonGetAuthHeaderValueForFirstParty]
  }
}

