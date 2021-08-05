package typings.gaze

import typings.gaze.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gazeStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with Mode
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait poll
    extends StObject
       with Mode
  inline def poll: poll = "poll".asInstanceOf[poll]
  
  @js.native
  sealed trait watch
    extends StObject
       with Mode
  inline def watch: watch = "watch".asInstanceOf[watch]
}
