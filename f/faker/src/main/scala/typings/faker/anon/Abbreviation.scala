package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abbreviation extends js.Object {
  def abbreviation(): String = js.native
  def adjective(): String = js.native
  def ingverb(): String = js.native
  def noun(): String = js.native
  def phrase(): String = js.native
  def verb(): String = js.native
}

object Abbreviation {
  @scala.inline
  def apply(
    abbreviation: () => String,
    adjective: () => String,
    ingverb: () => String,
    noun: () => String,
    phrase: () => String,
    verb: () => String
  ): Abbreviation = {
    val __obj = js.Dynamic.literal(abbreviation = js.Any.fromFunction0(abbreviation), adjective = js.Any.fromFunction0(adjective), ingverb = js.Any.fromFunction0(ingverb), noun = js.Any.fromFunction0(noun), phrase = js.Any.fromFunction0(phrase), verb = js.Any.fromFunction0(verb))
    __obj.asInstanceOf[Abbreviation]
  }
  @scala.inline
  implicit class AbbreviationOps[Self <: Abbreviation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbreviation(value: () => String): Self = this.set("abbreviation", js.Any.fromFunction0(value))
    @scala.inline
    def setAdjective(value: () => String): Self = this.set("adjective", js.Any.fromFunction0(value))
    @scala.inline
    def setIngverb(value: () => String): Self = this.set("ingverb", js.Any.fromFunction0(value))
    @scala.inline
    def setNoun(value: () => String): Self = this.set("noun", js.Any.fromFunction0(value))
    @scala.inline
    def setPhrase(value: () => String): Self = this.set("phrase", js.Any.fromFunction0(value))
    @scala.inline
    def setVerb(value: () => String): Self = this.set("verb", js.Any.fromFunction0(value))
  }
  
}

