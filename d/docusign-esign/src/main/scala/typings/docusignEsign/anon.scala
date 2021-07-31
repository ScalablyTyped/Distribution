package typings.docusignEsign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BasePath extends StObject {
    
    var basePath: String
    
    var oAuthBasePath: String
  }
  object BasePath {
    
    @scala.inline
    def apply(basePath: String, oAuthBasePath: String): BasePath = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], oAuthBasePath = oAuthBasePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePath]
    }
    
    @scala.inline
    implicit class BasePathMutableBuilder[Self <: BasePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAuthBasePath(value: String): Self = StObject.set(x, "oAuthBasePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasePathDEMO extends StObject {
    
    var BasePath: DEMO
  }
  object BasePathDEMO {
    
    @scala.inline
    def apply(BasePath: DEMO): BasePathDEMO = {
      val __obj = js.Dynamic.literal(BasePath = BasePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePathDEMO]
    }
    
    @scala.inline
    implicit class BasePathDEMOMutableBuilder[Self <: BasePathDEMO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: DEMO): Self = StObject.set(x, "BasePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait CSV extends StObject {
    
    var CSV: String
    
    var MULTI: String
    
    var PIPES: String
    
    var SSV: String
    
    var TSV: String
  }
  object CSV {
    
    @scala.inline
    def apply(CSV: String, MULTI: String, PIPES: String, SSV: String, TSV: String): CSV = {
      val __obj = js.Dynamic.literal(CSV = CSV.asInstanceOf[js.Any], MULTI = MULTI.asInstanceOf[js.Any], PIPES = PIPES.asInstanceOf[js.Any], SSV = SSV.asInstanceOf[js.Any], TSV = TSV.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSV]
    }
    
    @scala.inline
    implicit class CSVMutableBuilder[Self <: CSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCSV(value: String): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMULTI(value: String): Self = StObject.set(x, "MULTI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPIPES(value: String): Self = StObject.set(x, "PIPES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSV(value: String): Self = StObject.set(x, "SSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTSV(value: String): Self = StObject.set(x, "TSV", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEMO extends StObject {
    
    var DEMO: String
    
    var PRODUCTION: String
    
    var STAGE: String
  }
  object DEMO {
    
    @scala.inline
    def apply(DEMO: String, PRODUCTION: String, STAGE: String): DEMO = {
      val __obj = js.Dynamic.literal(DEMO = DEMO.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEMO]
    }
    
    @scala.inline
    implicit class DEMOMutableBuilder[Self <: DEMO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEMO(value: String): Self = StObject.set(x, "DEMO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRODUCTION(value: String): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTAGE(value: String): Self = StObject.set(x, "STAGE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Include extends StObject {
    
    var include: js.UndefOr[String] = js.undefined
    
    var includeItems: js.UndefOr[String] = js.undefined
    
    var startPosition: js.UndefOr[String] = js.undefined
    
    var userFilter: js.UndefOr[String] = js.undefined
  }
  object Include {
    
    @scala.inline
    def apply(): Include = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Include]
    }
    
    @scala.inline
    implicit class IncludeMutableBuilder[Self <: Include] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeItems(value: String): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setUserFilter(value: String): Self = StObject.set(x, "userFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserFilterUndefined: Self = StObject.set(x, "userFilter", js.undefined)
    }
  }
  
  trait IncludeItems extends StObject {
    
    var includeItems: js.UndefOr[String] = js.undefined
  }
  object IncludeItems {
    
    @scala.inline
    def apply(): IncludeItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeItems]
    }
    
    @scala.inline
    implicit class IncludeItemsMutableBuilder[Self <: IncludeItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeItems(value: String): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
    }
  }
}
