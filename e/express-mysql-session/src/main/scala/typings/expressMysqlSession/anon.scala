package typings.expressMysqlSession

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def apply(options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  /* Inlined std.Partial<express-mysql-session.express-mysql-session.ColumnNames> */
  @js.native
  trait PartialColumnNames extends StObject {
    
    var data: js.UndefOr[String] = js.native
    
    var expires: js.UndefOr[String] = js.native
    
    var session_id: js.UndefOr[String] = js.native
  }
  object PartialColumnNames {
    
    @scala.inline
    def apply(): PartialColumnNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialColumnNames]
    }
    
    @scala.inline
    implicit class PartialColumnNamesMutableBuilder[Self <: PartialColumnNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_idUndefined: Self = StObject.set(x, "session_id", js.undefined)
    }
  }
  
  /* Inlined std.Partial<express-mysql-session.express-mysql-session.Schema> */
  @js.native
  trait PartialSchema extends StObject {
    
    var columnNames: js.UndefOr[PartialColumnNames] = js.native
    
    var tableName: js.UndefOr[String] = js.native
  }
  object PartialSchema {
    
    @scala.inline
    def apply(): PartialSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSchema]
    }
    
    @scala.inline
    implicit class PartialSchemaMutableBuilder[Self <: PartialSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: PartialColumnNames): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
}
