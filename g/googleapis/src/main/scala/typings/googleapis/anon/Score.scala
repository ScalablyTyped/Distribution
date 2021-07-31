package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  var score: js.UndefOr[Double] = js.undefined
}
object Score {
  
  @scala.inline
  def apply(): Score = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Score]
  }
  
  @scala.inline
  implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
