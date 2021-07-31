package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callout
  extends StObject
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats
     with isAdGroupChild {
  
  def getId(): Double = js.native
  
  def getText(): String = js.native
  
  def setText(text: String): Unit = js.native
}
