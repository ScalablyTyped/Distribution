package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.googleCloudSpanner.commonMod.NormalCallback
import typings.googleCloudSpanner.commonMod.PagedCallback
import typings.googleCloudSpanner.commonMod.PagedOptions
import typings.googleCloudSpanner.commonMod.PagedOptionsWithFilter
import typings.googleCloudSpanner.commonMod.PagedResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IInstanceConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstanceConfigsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstancesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EnumKey[E /* <: StringDictionary[Any] */] = /* keyof E */ String

type GetInstanceConfigCallback = NormalCallback[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any]

type GetInstanceConfigResponse = js.Array[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any]

type GetInstanceConfigsCallback = PagedCallback[IInstanceConfig, IListInstanceConfigsResponse]

type GetInstanceConfigsOptions = PagedOptions

type GetInstanceConfigsResponse = PagedResponse[IInstanceConfig, IListInstanceConfigsResponse]

type GetInstancesCallback = PagedCallback[typings.googleCloudSpanner.instanceMod.Instance, IListInstancesResponse]

type GetInstancesOptions = PagedOptionsWithFilter

type GetInstancesResponse = PagedResponse[typings.googleCloudSpanner.instanceMod.Instance, IListInstancesResponse]

type IOperation = typings.googleCloudSpanner.protosMod.google.longrunning.IOperation

type TranslateEnumKeys[T, U /* <: /* keyof T */ String */, E /* <: StringDictionary[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: P extends U? @google-cloud/spanner.@google-cloud/spanner.EnumKey<E> | null | undefined : T[P]}
  */ typings.googleCloudSpanner.googleCloudSpannerStrings.TranslateEnumKeys & TopLevel[T]
