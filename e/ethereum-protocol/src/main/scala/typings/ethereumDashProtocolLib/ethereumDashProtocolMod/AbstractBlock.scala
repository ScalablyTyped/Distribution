package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AbstractBlock extends js.Object {
  var difficulty: bignumberDotJsLib.bignumberDotJsMod.default
  var extraData: java.lang.String
  var gasLimit: scala.Double
  var gasUsed: scala.Double
  var hash: java.lang.String | scala.Null
  var logsBloom: java.lang.String | scala.Null
  var miner: java.lang.String
  var nonce: java.lang.String | scala.Null
  var number: scala.Double | scala.Null
  var parentHash: java.lang.String
  var sha3Uncles: java.lang.String
  var size: scala.Double
  var stateRoot: java.lang.String
  var timestamp: scala.Double
  var totalDifficulty: bignumberDotJsLib.bignumberDotJsMod.default
  var transactionsRoot: java.lang.String
  var uncles: js.Array[java.lang.String]
}

