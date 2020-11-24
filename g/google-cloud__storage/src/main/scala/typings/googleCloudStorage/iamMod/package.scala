package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iamMod {
  
  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* acl */ js.UndefOr[typings.googleCloudStorage.iamMod.Policy], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetPolicyResponse = js.Tuple2[
    typings.googleCloudStorage.iamMod.Policy, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* acl */ js.UndefOr[typings.googleCloudStorage.iamMod.Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type SetPolicyResponse = js.Tuple2[
    typings.googleCloudStorage.iamMod.Policy, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* acl */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type TestIamPermissionsResponse = js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
