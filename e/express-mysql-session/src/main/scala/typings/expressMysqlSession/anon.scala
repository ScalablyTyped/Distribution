package typings.expressMysqlSession

import typings.express.mod.RequestHandler
import typings.expressSession.mod.SessionOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def apply(options: SessionOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
  }
  
  /* Inlined std.Partial<express-mysql-session.express-mysql-session.ColumnNames> */
  trait PartialColumnNames extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[String] = js.undefined
    
    var session_id: js.UndefOr[String] = js.undefined
  }
  object PartialColumnNames {
    
    inline def apply(): PartialColumnNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialColumnNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialColumnNames] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
      
      inline def setSession_idUndefined: Self = StObject.set(x, "session_id", js.undefined)
    }
  }
  
  /* Inlined std.Partial<express-mysql-session.express-mysql-session.Schema> */
  trait PartialSchema extends StObject {
    
    var columnNames: js.UndefOr[PartialColumnNames] = js.undefined
    
    var tableName: js.UndefOr[String] = js.undefined
  }
  object PartialSchema {
    
    inline def apply(): PartialSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSchema] (val x: Self) extends AnyVal {
      
      inline def setColumnNames(value: PartialColumnNames): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
}
