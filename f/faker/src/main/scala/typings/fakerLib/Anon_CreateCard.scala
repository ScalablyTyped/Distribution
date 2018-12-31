package typings
package fakerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateCard extends js.Object {
  def contextualCard(): fakerLib.FakerNs.ContextualCard = js.native
  def createCard(): fakerLib.FakerNs.Card = js.native
  def createTransaction(): fakerLib.FakerNs.Transaction = js.native
  def mustache(
    str: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | (js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String])
    ]
  ): java.lang.String = js.native
  def randomize(): java.lang.String = js.native
  def randomize[T](array: js.Array[T]): T = js.native
  def replaceSymbolWithNumber(): java.lang.String = js.native
  def replaceSymbolWithNumber(string: java.lang.String): java.lang.String = js.native
  def replaceSymbolWithNumber(string: java.lang.String, symbol: java.lang.String): java.lang.String = js.native
  def replaceSymbols(): java.lang.String = js.native
  def replaceSymbols(string: java.lang.String): java.lang.String = js.native
  def shuffle(): js.Array[java.lang.String] = js.native
  def shuffle[T](o: js.Array[T]): js.Array[T] = js.native
  def slugify(): java.lang.String = js.native
  def slugify(string: java.lang.String): java.lang.String = js.native
  def userCard(): fakerLib.FakerNs.UserCard = js.native
}

