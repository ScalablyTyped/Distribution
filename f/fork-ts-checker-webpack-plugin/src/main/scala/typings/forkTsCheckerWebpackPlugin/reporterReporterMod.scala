package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterReporterMod {
  
  @js.native
  trait Reporter extends StObject {
    
    def getReport(change: FilesChange): js.Promise[Report] = js.native
  }
  object Reporter {
    
    @scala.inline
    def apply(getReport: FilesChange => js.Promise[Report]): Reporter = {
      val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction1(getReport))
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit class ReporterMutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetReport(value: FilesChange => js.Promise[Report]): Self = StObject.set(x, "getReport", js.Any.fromFunction1(value))
    }
  }
}
