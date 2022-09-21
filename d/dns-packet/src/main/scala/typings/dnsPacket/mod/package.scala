package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.CAA
import typings.dnsPacket.dnsPacketStrings.HINFO
import typings.dnsPacket.dnsPacketStrings.MX
import typings.dnsPacket.dnsPacketStrings.SOA
import typings.dnsPacket.dnsPacketStrings.SRV
import typings.dnsPacket.dnsPacketStrings.TXT
import typings.dnsPacket.mod.^
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AUTHENTIC_DATA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("AUTHENTIC_DATA").asInstanceOf[Double]

inline def AUTHORITATIVE_ANSWER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("AUTHORITATIVE_ANSWER").asInstanceOf[Double]

inline def CHECKING_DISABLED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CHECKING_DISABLED").asInstanceOf[Double]

inline def RECURSION_AVAILABLE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RECURSION_AVAILABLE").asInstanceOf[Double]

inline def RECURSION_DESIRED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RECURSION_DESIRED").asInstanceOf[Double]

inline def TRUNCATED_RESPONSE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TRUNCATED_RESPONSE").asInstanceOf[Double]

inline def encodingLength(packet: Packet): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(packet.asInstanceOf[js.Any]).asInstanceOf[Double]

type Answer = StringAnswer | SrvAnswer | HInfoAnswer | SoaAnswer | TxtAnswer | CaaAnswer | MxAnswer | BufferAnswer | OptAnswer

type BufferAnswer = BaseAnswer[OtherRecordType, Buffer]

type CaaAnswer = BaseAnswer[CAA, CaaData]

type HInfoAnswer = BaseAnswer[HINFO, HInfoData]

type MxAnswer = BaseAnswer[MX, MxData]

type OptCode[K /* <: OptCodeType */] = /* import warning: importer.ImportType#apply Failed type conversion: dns-packet.dns-packet.OptCodes[K] */ js.Any

type SoaAnswer = BaseAnswer[SOA, SoaData]

type SrvAnswer = BaseAnswer[SRV, SrvData]

type StringAnswer = BaseAnswer[StringRecordType, String]

type TxtAnswer = BaseAnswer[TXT, TxtData]

type TxtData = String | Buffer | (js.Array[String | Buffer])
