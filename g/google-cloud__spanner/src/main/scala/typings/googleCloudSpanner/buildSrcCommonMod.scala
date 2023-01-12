package typings.googleCloudSpanner

import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.Operation_
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCommonMod {
  
  @JSImport("@google-cloud/spanner/build/src/common", "CLOUD_RESOURCE_HEADER")
  @js.native
  val CLOUD_RESOURCE_HEADER: /* "google-cloud-resource-prefix" */ String = js.native
  
  type IOperation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.longrunning.IOperation */ Any
  
  type LongRunningCallback[Resource] = js.Function4[
    /* err */ ServiceError | Null, 
    /* resource */ js.UndefOr[Resource | Null], 
    /* operation */ js.UndefOr[Operation_ | Null], 
    /* apiResponse */ js.UndefOr[IOperation], 
    Unit
  ]
  
  type NormalCallback[TResponse] = js.Function2[/* err */ ServiceError | Null, /* res */ js.UndefOr[TResponse | Null], Unit]
  
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ ServiceError | Null, 
    /* results */ js.UndefOr[js.Array[Item] | Null], 
    /* nextQuery */ js.UndefOr[js.Object | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
  
  trait PagedOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PagedOptions {
    
    inline def apply(): PagedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagedOptions] (val x: Self) extends AnyVal {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PagedOptionsWithFilter
    extends StObject
       with PagedOptions {
    
    var filter: js.UndefOr[String] = js.undefined
  }
  object PagedOptionsWithFilter {
    
    inline def apply(): PagedOptionsWithFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagedOptionsWithFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagedOptionsWithFilter] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  type PagedResponse[Item, Response] = js.Tuple3[js.Array[Item], js.Object | Null, Response]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    R extends void ? @google-cloud/spanner.@google-cloud/spanner/build/src/common.NormalCallback<T> : @google-cloud/spanner.@google-cloud/spanner/build/src/common.PagedCallback<T, R>
    }}}
    */
  type RequestCallback[T, R] = NormalCallback[T]
  
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ ServiceError | Null, 
    /* resource */ js.UndefOr[Resource | Null], 
    /* response */ js.UndefOr[Response], 
    Unit
  ]
  
  type Schema = String | js.Array[String] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IUpdateDatabaseDdlRequest */ Any)
}
