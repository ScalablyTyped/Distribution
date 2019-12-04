package typings.atFirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetAuthHeaderValueForFirstParty extends js.Object {
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null
}

object Anon_GetAuthHeaderValueForFirstParty {
  @scala.inline
  def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => String | Null): Anon_GetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal(getAuthHeaderValueForFirstParty = js.Any.fromFunction1(getAuthHeaderValueForFirstParty))
  
    __obj.asInstanceOf[Anon_GetAuthHeaderValueForFirstParty]
  }
}

