package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcCommonMod.PagedCallback
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptions
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptionsWithFilter
import typings.googleCloudSpanner.buildSrcCommonMod.PagedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EnumKey[E /* <: StringDictionary[Any] */] = /* keyof E */ String

type GetInstanceConfigCallback = NormalCallback[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any]

type GetInstanceConfigOperationsCallback = PagedCallback[
IOperation, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigOperationsResponse */ Any]

type GetInstanceConfigOperationsOptions = PagedOptionsWithFilter

type GetInstanceConfigOperationsResponse = PagedResponse[
IOperation, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigOperationsResponse */ Any]

type GetInstanceConfigResponse = js.Array[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any]

type GetInstanceConfigsCallback = PagedCallback[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstanceConfig */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigsResponse */ Any]

type GetInstanceConfigsOptions = PagedOptions

type GetInstanceConfigsResponse = PagedResponse[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstanceConfig */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigsResponse */ Any]

type GetInstancesCallback = PagedCallback[
typings.googleCloudSpanner.buildSrcInstanceMod.Instance, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstancesResponse */ Any]

type GetInstancesOptions = PagedOptionsWithFilter

type GetInstancesResponse = PagedResponse[
typings.googleCloudSpanner.buildSrcInstanceMod.Instance, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstancesResponse */ Any]

type IOperation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.longrunning.IOperation */ Any
