package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calcElapsedTimeMod {
  
  @JSImport("gatsby-cli/lib/util/calc-elapsed-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calcElapsedTime(startTime: js.Tuple2[Double, Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calcElapsedTime")(startTime.asInstanceOf[js.Any]).asInstanceOf[String]
}
