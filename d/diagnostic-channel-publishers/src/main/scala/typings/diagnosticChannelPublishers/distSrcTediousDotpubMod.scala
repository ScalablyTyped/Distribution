package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTediousDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/tedious.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/tedious.pub", "tedious")
  @js.native
  val tedious: IModulePatcher = js.native
  
  trait ITediousData extends StObject {
    
    var database: Port
    
    var duration: Double
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var query: Plan
    
    var result: js.UndefOr[ITediousResult] = js.undefined
  }
  object ITediousData {
    
    inline def apply(database: Port, duration: Double, query: Plan): ITediousData = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITediousData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITediousData] (val x: Self) extends AnyVal {
      
      inline def setDatabase(value: Port): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setQuery(value: Plan): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResult(value: ITediousResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait ITediousResult extends StObject {
    
    var rowCount: Double
    
    var rows: Any
  }
  object ITediousResult {
    
    inline def apply(rowCount: Double, rows: Any): ITediousResult = {
      val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITediousResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITediousResult] (val x: Self) extends AnyVal {
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Any): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
