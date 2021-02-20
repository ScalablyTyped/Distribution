package typings.direction

import typings.direction.mod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionStrings {
  
  @js.native
  sealed trait ltr extends Direction
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait neutral extends Direction
  @scala.inline
  def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @js.native
  sealed trait rtl extends Direction
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
}
