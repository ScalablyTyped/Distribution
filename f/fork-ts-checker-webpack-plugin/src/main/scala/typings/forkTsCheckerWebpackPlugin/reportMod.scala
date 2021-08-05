package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportMod {
  
  trait Report extends StObject {
    
    def close(): js.Promise[Unit]
    
    def getDependencies(): js.Promise[Dependencies]
    
    def getIssues(): js.Promise[js.Array[Issue]]
  }
  object Report {
    
    inline def apply(
      close: () => js.Promise[Unit],
      getDependencies: () => js.Promise[Dependencies],
      getIssues: () => js.Promise[js.Array[Issue]]
    ): Report = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getDependencies = js.Any.fromFunction0(getDependencies), getIssues = js.Any.fromFunction0(getIssues))
      __obj.asInstanceOf[Report]
    }
    
    extension [Self <: Report](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetDependencies(value: () => js.Promise[Dependencies]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction0(value))
      
      inline def setGetIssues(value: () => js.Promise[js.Array[Issue]]): Self = StObject.set(x, "getIssues", js.Any.fromFunction0(value))
    }
  }
}
