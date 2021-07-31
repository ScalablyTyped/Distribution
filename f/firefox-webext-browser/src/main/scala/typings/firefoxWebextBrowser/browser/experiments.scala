package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.startup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Not allowed in: Content scripts, Devtools pages */
object experiments {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_child
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_child
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_child
  */
  trait APIChildScope extends StObject
  object APIChildScope {
    
    @scala.inline
    def addon_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_child = "addon_child".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_child]
    
    @scala.inline
    def content_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_child = "content_child".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_child]
    
    @scala.inline
    def devtools_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_child = "devtools_child".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_child]
  }
  
  type APIEvent = startup
  
  type APIEvents = js.Array[APIEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_parent
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_parent
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_parent
  */
  trait APIParentScope extends StObject
  object APIParentScope {
    
    @scala.inline
    def addon_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_parent = "addon_parent".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_parent]
    
    @scala.inline
    def content_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_parent = "content_parent".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_parent]
    
    @scala.inline
    def devtools_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_parent = "devtools_parent".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_parent]
  }
  
  type APIPath = js.Array[String]
  
  type APIPaths = js.Array[APIPath]
  
  /* experiments types */
  trait ExperimentAPI extends StObject {
    
    var child: js.UndefOr[ExperimentAPIChild] = js.undefined
    
    var parent: js.UndefOr[ExperimentAPIParent] = js.undefined
    
    var schema: ExperimentURL
  }
  object ExperimentAPI {
    
    @scala.inline
    def apply(schema: ExperimentURL): ExperimentAPI = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPI]
    }
    
    @scala.inline
    implicit class ExperimentAPIMutableBuilder[Self <: ExperimentAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: ExperimentAPIChild): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setParent(value: ExperimentAPIParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setSchema(value: ExperimentURL): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExperimentAPIChild extends StObject {
    
    var paths: APIPaths
    
    var scopes: js.Array[APIChildScope]
    
    var script: ExperimentURL
  }
  object ExperimentAPIChild {
    
    @scala.inline
    def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): ExperimentAPIChild = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPIChild]
    }
    
    @scala.inline
    implicit class ExperimentAPIChildMutableBuilder[Self <: ExperimentAPIChild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: APIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: APIPath*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setScopes(value: js.Array[APIChildScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: APIChildScope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setScript(value: ExperimentURL): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExperimentAPIParent extends StObject {
    
    var events: js.UndefOr[APIEvents] = js.undefined
    
    var paths: js.UndefOr[APIPaths] = js.undefined
    
    var scopes: js.UndefOr[js.Array[APIParentScope]] = js.undefined
    
    var script: ExperimentURL
  }
  object ExperimentAPIParent {
    
    @scala.inline
    def apply(script: ExperimentURL): ExperimentAPIParent = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPIParent]
    }
    
    @scala.inline
    implicit class ExperimentAPIParentMutableBuilder[Self <: ExperimentAPIParent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: APIEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: APIEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: APIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: APIPath*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setScopes(value: js.Array[APIParentScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: APIParentScope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setScript(value: ExperimentURL): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  type ExperimentURL = String
}
