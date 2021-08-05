package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BundleStats extends StObject {
    
    var bundleStats: js.UndefOr[js.Any] = js.undefined
    
    var clientsCount: js.UndefOr[Double] = js.undefined
    
    var pageDataStats: js.UndefOr[js.Any] = js.undefined
    
    var pagesCount: js.UndefOr[Double] = js.undefined
    
    var paths: js.UndefOr[js.Array[js.UndefOr[String]]] = js.undefined
    
    var queryStats: js.UndefOr[js.Any] = js.undefined
  }
  object BundleStats {
    
    inline def apply(): BundleStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleStats]
    }
    
    extension [Self <: BundleStats](x: Self) {
      
      inline def setBundleStats(value: js.Any): Self = StObject.set(x, "bundleStats", value.asInstanceOf[js.Any])
      
      inline def setBundleStatsUndefined: Self = StObject.set(x, "bundleStats", js.undefined)
      
      inline def setClientsCount(value: Double): Self = StObject.set(x, "clientsCount", value.asInstanceOf[js.Any])
      
      inline def setClientsCountUndefined: Self = StObject.set(x, "clientsCount", js.undefined)
      
      inline def setPageDataStats(value: js.Any): Self = StObject.set(x, "pageDataStats", value.asInstanceOf[js.Any])
      
      inline def setPageDataStatsUndefined: Self = StObject.set(x, "pageDataStats", js.undefined)
      
      inline def setPagesCount(value: Double): Self = StObject.set(x, "pagesCount", value.asInstanceOf[js.Any])
      
      inline def setPagesCountUndefined: Self = StObject.set(x, "pagesCount", js.undefined)
      
      inline def setPaths(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      inline def setQueryStats(value: js.Any): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
      
      inline def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    }
  }
  
  trait Dependencies extends StObject {
    
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var devDependencies: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Dependencies {
    
    inline def apply(): Dependencies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dependencies]
    }
    
    extension [Self <: Dependencies](x: Self) {
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setDevDependencies(value: js.Array[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDevDependenciesVarargs(value: String*): Self = StObject.set(x, "devDependencies", js.Array(value :_*))
    }
  }
  
  trait Stack extends StObject {
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object Stack {
    
    inline def apply(): Stack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stack]
    }
    
    extension [Self <: Stack](x: Self) {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
