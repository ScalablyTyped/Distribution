package typings.dnsPacket

import typings.dnsPacket.mod.OptCodeType
import typings.dnsPacket.mod.OtherRecordType
import typings.dnsPacket.mod.RecordClass
import typings.dnsPacket.mod.RecordType
import typings.dnsPacket.mod.StringRecordType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsPacketStrings {
  
  @js.native
  sealed trait A
    extends StObject
       with RecordType
       with StringRecordType
  inline def A: A = "A".asInstanceOf[A]
  
  @js.native
  sealed trait AAAA
    extends StObject
       with RecordType
       with StringRecordType
  inline def AAAA: AAAA = "AAAA".asInstanceOf[AAAA]
  
  @js.native
  sealed trait AFSDB
    extends StObject
       with OtherRecordType
       with RecordType
  inline def AFSDB: AFSDB = "AFSDB".asInstanceOf[AFSDB]
  
  @js.native
  sealed trait ANY
    extends StObject
       with RecordClass
  inline def ANY: ANY = "ANY".asInstanceOf[ANY]
  
  @js.native
  sealed trait APL
    extends StObject
       with OtherRecordType
       with RecordType
  inline def APL: APL = "APL".asInstanceOf[APL]
  
  @js.native
  sealed trait AXFR
    extends StObject
       with OtherRecordType
       with RecordType
  inline def AXFR: AXFR = "AXFR".asInstanceOf[AXFR]
  
  @js.native
  sealed trait CAA
    extends StObject
       with RecordType
  inline def CAA: CAA = "CAA".asInstanceOf[CAA]
  
  @js.native
  sealed trait CDNSKEY
    extends StObject
       with OtherRecordType
       with RecordType
  inline def CDNSKEY: CDNSKEY = "CDNSKEY".asInstanceOf[CDNSKEY]
  
  @js.native
  sealed trait CDS
    extends StObject
       with OtherRecordType
       with RecordType
  inline def CDS: CDS = "CDS".asInstanceOf[CDS]
  
  @js.native
  sealed trait CERT
    extends StObject
       with OtherRecordType
       with RecordType
  inline def CERT: CERT = "CERT".asInstanceOf[CERT]
  
  @js.native
  sealed trait CH
    extends StObject
       with RecordClass
  inline def CH: CH = "CH".asInstanceOf[CH]
  
  @js.native
  sealed trait CHAIN
    extends StObject
       with OptCodeType
  inline def CHAIN: CHAIN = "CHAIN".asInstanceOf[CHAIN]
  
  @js.native
  sealed trait CLIENT_SUBNET
    extends StObject
       with OptCodeType
  inline def CLIENT_SUBNET: CLIENT_SUBNET = "CLIENT_SUBNET".asInstanceOf[CLIENT_SUBNET]
  
  @js.native
  sealed trait CNAME
    extends StObject
       with RecordType
       with StringRecordType
  inline def CNAME: CNAME = "CNAME".asInstanceOf[CNAME]
  
  @js.native
  sealed trait COOKIE
    extends StObject
       with OptCodeType
  inline def COOKIE: COOKIE = "COOKIE".asInstanceOf[COOKIE]
  
  @js.native
  sealed trait CS
    extends StObject
       with RecordClass
  inline def CS: CS = "CS".asInstanceOf[CS]
  
  @js.native
  sealed trait DAU
    extends StObject
       with OptCodeType
  inline def DAU: DAU = "DAU".asInstanceOf[DAU]
  
  @js.native
  sealed trait DEVICEID
    extends StObject
       with OptCodeType
  inline def DEVICEID: DEVICEID = "DEVICEID".asInstanceOf[DEVICEID]
  
  @js.native
  sealed trait DHCID
    extends StObject
       with OtherRecordType
       with RecordType
  inline def DHCID: DHCID = "DHCID".asInstanceOf[DHCID]
  
  @js.native
  sealed trait DHU
    extends StObject
       with OptCodeType
  inline def DHU: DHU = "DHU".asInstanceOf[DHU]
  
  @js.native
  sealed trait DLV
    extends StObject
       with OtherRecordType
       with RecordType
  inline def DLV: DLV = "DLV".asInstanceOf[DLV]
  
  @js.native
  sealed trait DNAME
    extends StObject
       with RecordType
       with StringRecordType
  inline def DNAME: DNAME = "DNAME".asInstanceOf[DNAME]
  
  @js.native
  sealed trait DNSKEY
    extends StObject
       with OtherRecordType
       with RecordType
  inline def DNSKEY: DNSKEY = "DNSKEY".asInstanceOf[DNSKEY]
  
  @js.native
  sealed trait DS
    extends StObject
       with OtherRecordType
       with RecordType
  inline def DS: DS = "DS".asInstanceOf[DS]
  
  @js.native
  sealed trait EXPIRE
    extends StObject
       with OptCodeType
  inline def EXPIRE: EXPIRE = "EXPIRE".asInstanceOf[EXPIRE]
  
  @js.native
  sealed trait HINFO
    extends StObject
       with RecordType
  inline def HINFO: HINFO = "HINFO".asInstanceOf[HINFO]
  
  @js.native
  sealed trait HIP
    extends StObject
       with OtherRecordType
       with RecordType
  inline def HIP: HIP = "HIP".asInstanceOf[HIP]
  
  @js.native
  sealed trait HS
    extends StObject
       with RecordClass
  inline def HS: HS = "HS".asInstanceOf[HS]
  
  @js.native
  sealed trait IN
    extends StObject
       with RecordClass
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait IPSECKEY
    extends StObject
       with OtherRecordType
       with RecordType
  inline def IPSECKEY: IPSECKEY = "IPSECKEY".asInstanceOf[IPSECKEY]
  
  @js.native
  sealed trait IXFR
    extends StObject
       with OtherRecordType
       with RecordType
  inline def IXFR: IXFR = "IXFR".asInstanceOf[IXFR]
  
  @js.native
  sealed trait KEY
    extends StObject
       with OtherRecordType
       with RecordType
  inline def KEY: KEY = "KEY".asInstanceOf[KEY]
  
  @js.native
  sealed trait KEY_TAG
    extends StObject
       with OptCodeType
  inline def KEY_TAG: KEY_TAG = "KEY_TAG".asInstanceOf[KEY_TAG]
  
  @js.native
  sealed trait KX
    extends StObject
       with OtherRecordType
       with RecordType
  inline def KX: KX = "KX".asInstanceOf[KX]
  
  @js.native
  sealed trait LLQ
    extends StObject
       with OptCodeType
  inline def LLQ: LLQ = "LLQ".asInstanceOf[LLQ]
  
  @js.native
  sealed trait LOC
    extends StObject
       with OtherRecordType
       with RecordType
  inline def LOC: LOC = "LOC".asInstanceOf[LOC]
  
  @js.native
  sealed trait MX
    extends StObject
       with RecordType
  inline def MX: MX = "MX".asInstanceOf[MX]
  
  @js.native
  sealed trait N3U
    extends StObject
       with OptCodeType
  inline def N3U: N3U = "N3U".asInstanceOf[N3U]
  
  @js.native
  sealed trait NAPTR
    extends StObject
       with OtherRecordType
       with RecordType
  inline def NAPTR: NAPTR = "NAPTR".asInstanceOf[NAPTR]
  
  @js.native
  sealed trait NS
    extends StObject
       with RecordType
       with StringRecordType
  inline def NS: NS = "NS".asInstanceOf[NS]
  
  @js.native
  sealed trait NSEC
    extends StObject
       with OtherRecordType
       with RecordType
  inline def NSEC: NSEC = "NSEC".asInstanceOf[NSEC]
  
  @js.native
  sealed trait NSEC3
    extends StObject
       with OtherRecordType
       with RecordType
  inline def NSEC3: NSEC3 = "NSEC3".asInstanceOf[NSEC3]
  
  @js.native
  sealed trait NSEC3PARAM
    extends StObject
       with OtherRecordType
       with RecordType
  inline def NSEC3PARAM: NSEC3PARAM = "NSEC3PARAM".asInstanceOf[NSEC3PARAM]
  
  @js.native
  sealed trait NSID
    extends StObject
       with OptCodeType
  inline def NSID: NSID = "NSID".asInstanceOf[NSID]
  
  @js.native
  sealed trait NULL
    extends StObject
       with OtherRecordType
       with RecordType
  inline def NULL: NULL = "NULL".asInstanceOf[NULL]
  
  @js.native
  sealed trait OPT
    extends StObject
       with RecordType
  inline def OPT: OPT = "OPT".asInstanceOf[OPT]
  
  @js.native
  sealed trait OPTION_0
    extends StObject
       with OptCodeType
  inline def OPTION_0: OPTION_0 = "OPTION_0".asInstanceOf[OPTION_0]
  
  @js.native
  sealed trait OPTION_4
    extends StObject
       with OptCodeType
  inline def OPTION_4: OPTION_4 = "OPTION_4".asInstanceOf[OPTION_4]
  
  @js.native
  sealed trait OPTION_65535
    extends StObject
       with OptCodeType
  inline def OPTION_65535: OPTION_65535 = "OPTION_65535".asInstanceOf[OPTION_65535]
  
  @js.native
  sealed trait PADDING
    extends StObject
       with OptCodeType
  inline def PADDING: PADDING = "PADDING".asInstanceOf[PADDING]
  
  @js.native
  sealed trait PTR
    extends StObject
       with RecordType
       with StringRecordType
  inline def PTR: PTR = "PTR".asInstanceOf[PTR]
  
  @js.native
  sealed trait RP
    extends StObject
       with OtherRecordType
       with RecordType
  inline def RP: RP = "RP".asInstanceOf[RP]
  
  @js.native
  sealed trait RRSIG
    extends StObject
       with OtherRecordType
       with RecordType
  inline def RRSIG: RRSIG = "RRSIG".asInstanceOf[RRSIG]
  
  @js.native
  sealed trait SIG
    extends StObject
       with OtherRecordType
       with RecordType
  inline def SIG: SIG = "SIG".asInstanceOf[SIG]
  
  @js.native
  sealed trait SOA
    extends StObject
       with RecordType
  inline def SOA: SOA = "SOA".asInstanceOf[SOA]
  
  @js.native
  sealed trait SRV
    extends StObject
       with RecordType
  inline def SRV: SRV = "SRV".asInstanceOf[SRV]
  
  @js.native
  sealed trait SSHFP
    extends StObject
       with OtherRecordType
       with RecordType
  inline def SSHFP: SSHFP = "SSHFP".asInstanceOf[SSHFP]
  
  @js.native
  sealed trait TA
    extends StObject
       with OtherRecordType
       with RecordType
  inline def TA: TA = "TA".asInstanceOf[TA]
  
  @js.native
  sealed trait TCP_KEEPALIVE
    extends StObject
       with OptCodeType
  inline def TCP_KEEPALIVE: TCP_KEEPALIVE = "TCP_KEEPALIVE".asInstanceOf[TCP_KEEPALIVE]
  
  @js.native
  sealed trait TKEY
    extends StObject
       with OtherRecordType
       with RecordType
  inline def TKEY: TKEY = "TKEY".asInstanceOf[TKEY]
  
  @js.native
  sealed trait TLSA
    extends StObject
       with OtherRecordType
       with RecordType
  inline def TLSA: TLSA = "TLSA".asInstanceOf[TLSA]
  
  @js.native
  sealed trait TSIG
    extends StObject
       with OtherRecordType
       with RecordType
  inline def TSIG: TSIG = "TSIG".asInstanceOf[TSIG]
  
  @js.native
  sealed trait TXT
    extends StObject
       with RecordType
  inline def TXT: TXT = "TXT".asInstanceOf[TXT]
  
  @js.native
  sealed trait UL
    extends StObject
       with OptCodeType
  inline def UL: UL = "UL".asInstanceOf[UL]
  
  @js.native
  sealed trait URI
    extends StObject
       with OtherRecordType
       with RecordType
  inline def URI: URI = "URI".asInstanceOf[URI]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait response extends StObject
  inline def response: response = "response".asInstanceOf[response]
}
