package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProtobufjs extends js.Object {
  var protobufjs: String
  var rollup: String
  var `rollup-plugin-copy-assets`: String
  var `rollup-plugin-json`: String
  var `rollup-plugin-node-resolve`: String
  var `rollup-plugin-replace`: String
  var `rollup-plugin-terser`: String
  var `rollup-plugin-typescript2`: String
  var typescript: String
}

object AnonProtobufjs {
  @scala.inline
  def apply(
    protobufjs: String,
    rollup: String,
    `rollup-plugin-copy-assets`: String,
    `rollup-plugin-json`: String,
    `rollup-plugin-node-resolve`: String,
    `rollup-plugin-replace`: String,
    `rollup-plugin-terser`: String,
    `rollup-plugin-typescript2`: String,
    typescript: String
  ): AnonProtobufjs = {
    val __obj = js.Dynamic.literal(protobufjs = protobufjs.asInstanceOf[js.Any], rollup = rollup.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-copy-assets")(`rollup-plugin-copy-assets`.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-json")(`rollup-plugin-json`.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-node-resolve")(`rollup-plugin-node-resolve`.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-replace")(`rollup-plugin-replace`.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-terser")(`rollup-plugin-terser`.asInstanceOf[js.Any])
    __obj.updateDynamic("rollup-plugin-typescript2")(`rollup-plugin-typescript2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtobufjs]
  }
}

