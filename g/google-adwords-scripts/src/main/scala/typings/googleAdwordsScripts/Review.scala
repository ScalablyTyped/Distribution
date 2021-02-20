package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Review
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  
  def getId(): Double = js.native
  
  def getSourceName(): String = js.native
  
  def getSourceUrl(): String = js.native
  
  def getText(): String = js.native
  
  def isExactlyQuoted(): Boolean = js.native
  
  def setExactlyQuoted(isExactlyQuoted: Boolean): Unit = js.native
  
  def setSourceName(sourceName: String): Unit = js.native
  
  def setSourceUrl(sourceUrl: String): Unit = js.native
  
  def setText(text: String): Unit = js.native
}
