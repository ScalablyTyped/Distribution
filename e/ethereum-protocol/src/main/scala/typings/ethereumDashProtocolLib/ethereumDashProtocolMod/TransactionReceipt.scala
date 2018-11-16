package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransactionReceipt extends js.Object {
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var contractAddress: java.lang.String | scala.Null
  var cumulativeGasUsed: scala.Double
  var from: java.lang.String
  var gasUsed: scala.Double
  var logs: js.Array[LogEntry]
  var status: scala.Null | java.lang.String | ethereumDashProtocolLib.ethereumDashProtocolLibNumbers.`0` | ethereumDashProtocolLib.ethereumDashProtocolLibNumbers.`1`
  var to: java.lang.String
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

