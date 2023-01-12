package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains spell checking related settings.
  */
trait SpellingInfo extends StObject {
  
  /**
    * Provides access to an array containing misspelled intervals.
    */
  val misspelledIntervals: js.Array[MisspelledInterval]
  
  /**
    * Gets a value specifying the spell checking state.
    */
  val spellCheckerState: SpellCheckerState
}
object SpellingInfo {
  
  inline def apply(misspelledIntervals: js.Array[MisspelledInterval], spellCheckerState: SpellCheckerState): SpellingInfo = {
    val __obj = js.Dynamic.literal(misspelledIntervals = misspelledIntervals.asInstanceOf[js.Any], spellCheckerState = spellCheckerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpellingInfo] (val x: Self) extends AnyVal {
    
    inline def setMisspelledIntervals(value: js.Array[MisspelledInterval]): Self = StObject.set(x, "misspelledIntervals", value.asInstanceOf[js.Any])
    
    inline def setMisspelledIntervalsVarargs(value: MisspelledInterval*): Self = StObject.set(x, "misspelledIntervals", js.Array(value*))
    
    inline def setSpellCheckerState(value: SpellCheckerState): Self = StObject.set(x, "spellCheckerState", value.asInstanceOf[js.Any])
  }
}
