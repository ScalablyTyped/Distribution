package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
@js.native
trait SpellingInfo extends js.Object {
  /**
    * Provides access to an array containing misspelled intervals.
    */
  val misspelledIntervals: js.Array[MisspelledInterval] = js.native
  /**
    * Gets a value specifying the spell checking state.
    */
  val spellCheckerState: SpellCheckerState = js.native
}

object SpellingInfo {
  @scala.inline
  def apply(misspelledIntervals: js.Array[MisspelledInterval], spellCheckerState: SpellCheckerState): SpellingInfo = {
    val __obj = js.Dynamic.literal(misspelledIntervals = misspelledIntervals.asInstanceOf[js.Any], spellCheckerState = spellCheckerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingInfo]
  }
  @scala.inline
  implicit class SpellingInfoOps[Self <: SpellingInfo] (val x: Self) extends AnyVal {
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
    def setMisspelledIntervalsVarargs(value: MisspelledInterval*): Self = this.set("misspelledIntervals", js.Array(value :_*))
    @scala.inline
    def setMisspelledIntervals(value: js.Array[MisspelledInterval]): Self = this.set("misspelledIntervals", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellCheckerState(value: SpellCheckerState): Self = this.set("spellCheckerState", value.asInstanceOf[js.Any])
  }
  
}

