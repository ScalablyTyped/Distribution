package typings.googleCloudKms.mod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeyManagementServiceClient {
  type AsymmetricSignCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[
      typings.googleCloudKms.mod.v1.KeyManagementServiceClient.AsymmetricSignResponse, 
      js.Any, 
      js.Any
    ], 
    scala.Unit
  ]
  type CreateCryptoKeyCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[typings.googleCloudKms.mod.v1.CryptoKey, js.Any, js.Any], 
    scala.Unit
  ]
  type CreateKeyRingCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[typings.googleCloudKms.mod.v1.KeyRing, js.Any, js.Any], 
    scala.Unit
  ]
  type DecryptCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[
      typings.googleCloudKms.mod.v1.KeyManagementServiceClient.DecryptResponse, 
      js.Any, 
      js.Any
    ], 
    scala.Unit
  ]
  type EncryptCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[
      typings.googleCloudKms.mod.v1.KeyManagementServiceClient.EncryptResponse, 
      js.Any, 
      js.Any
    ], 
    scala.Unit
  ]
  type ListCryptoKeysCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[js.Array[typings.googleCloudKms.mod.v1.CryptoKey], js.Any, js.Any], 
    scala.Unit
  ]
  type ListKeyRingsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.Tuple3[js.Array[typings.googleCloudKms.mod.v1.KeyRing], js.Any, js.Any], 
    scala.Unit
  ]
}
