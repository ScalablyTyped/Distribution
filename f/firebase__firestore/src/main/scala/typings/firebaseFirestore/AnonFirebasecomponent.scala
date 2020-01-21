package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirebasecomponent extends js.Object {
  @JSName("@firebase/component")
  var `@firebaseSlashcomponent`: String
  @JSName("@firebase/firestore-types")
  var `@firebaseSlashfirestore-types`: String
  @JSName("@firebase/logger")
  var `@firebaseSlashlogger`: String
  @JSName("@firebase/util")
  var `@firebaseSlashutil`: String
  @JSName("@firebase/webchannel-wrapper")
  var `@firebaseSlashwebchannel-wrapper`: String
  @JSName("@grpc/proto-loader")
  var `@grpcSlashproto-loader`: String
  var grpc: String
  var tslib: String
}

object AnonFirebasecomponent {
  @scala.inline
  def apply(
    `@firebaseSlashcomponent`: String,
    `@firebaseSlashfirestore-types`: String,
    `@firebaseSlashlogger`: String,
    `@firebaseSlashutil`: String,
    `@firebaseSlashwebchannel-wrapper`: String,
    `@grpcSlashproto-loader`: String,
    grpc: String,
    tslib: String
  ): AnonFirebasecomponent = {
    val __obj = js.Dynamic.literal(grpc = grpc.asInstanceOf[js.Any], tslib = tslib.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/component")(`@firebaseSlashcomponent`.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/firestore-types")(`@firebaseSlashfirestore-types`.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/logger")(`@firebaseSlashlogger`.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/util")(`@firebaseSlashutil`.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/webchannel-wrapper")(`@firebaseSlashwebchannel-wrapper`.asInstanceOf[js.Any])
    __obj.updateDynamic("@grpc/proto-loader")(`@grpcSlashproto-loader`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirebasecomponent]
  }
}

