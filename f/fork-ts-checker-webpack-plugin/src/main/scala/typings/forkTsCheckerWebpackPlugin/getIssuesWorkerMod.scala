package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIssuesWorkerMod {
  
  type GetIssuesWorker = js.Function2[/* change */ FilesChange, /* watching */ Boolean, js.Promise[js.Array[Issue]]]
}
