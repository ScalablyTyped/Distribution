package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataStudioApp allows scripts to interact with developer-oriented features for Data Studio.
  */
trait DataStudioApp extends StObject {
  
  def createCommunityConnector(): CommunityConnector
}
object DataStudioApp {
  
  @scala.inline
  def apply(createCommunityConnector: () => CommunityConnector): DataStudioApp = {
    val __obj = js.Dynamic.literal(createCommunityConnector = js.Any.fromFunction0(createCommunityConnector))
    __obj.asInstanceOf[DataStudioApp]
  }
  
  @scala.inline
  implicit class DataStudioAppMutableBuilder[Self <: DataStudioApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCommunityConnector(value: () => CommunityConnector): Self = StObject.set(x, "createCommunityConnector", js.Any.fromFunction0(value))
  }
}
