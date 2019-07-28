package typings.dockerode

import typings.dockerode.dockerodeMod.LoggingDriverType
import typings.dockerode.dockerodeMod.MountConsistency
import typings.dockerode.dockerodeMod.MountPropagation
import typings.dockerode.dockerodeMod.MountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dockerodeStrings {
  @js.native
  sealed trait awslogs extends LoggingDriverType
  
  @js.native
  sealed trait bind extends MountType
  
  @js.native
  sealed trait cached extends MountConsistency
  
  @js.native
  sealed trait consistent extends MountConsistency
  
  @js.native
  sealed trait default extends MountConsistency
  
  @js.native
  sealed trait delegated extends MountConsistency
  
  @js.native
  sealed trait etwlogs extends LoggingDriverType
  
  @js.native
  sealed trait fluentd extends LoggingDriverType
  
  @js.native
  sealed trait gelf extends LoggingDriverType
  
  @js.native
  sealed trait global extends js.Object
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait journald extends LoggingDriverType
  
  @js.native
  sealed trait `json-file` extends LoggingDriverType
  
  @js.native
  sealed trait local extends js.Object
  
  @js.native
  sealed trait none extends LoggingDriverType
  
  @js.native
  sealed trait `private` extends MountPropagation
  
  @js.native
  sealed trait rprivate extends MountPropagation
  
  @js.native
  sealed trait rshared extends MountPropagation
  
  @js.native
  sealed trait rslave extends MountPropagation
  
  @js.native
  sealed trait shared extends MountPropagation
  
  @js.native
  sealed trait slave extends MountPropagation
  
  @js.native
  sealed trait splunk extends LoggingDriverType
  
  @js.native
  sealed trait syslog extends LoggingDriverType
  
  @js.native
  sealed trait tmpfs extends MountType
  
  @js.native
  sealed trait volume extends MountType
  
  @scala.inline
  def awslogs: awslogs = "awslogs".asInstanceOf[awslogs]
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  @scala.inline
  def cached: cached = "cached".asInstanceOf[cached]
  @scala.inline
  def consistent: consistent = "consistent".asInstanceOf[consistent]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def delegated: delegated = "delegated".asInstanceOf[delegated]
  @scala.inline
  def etwlogs: etwlogs = "etwlogs".asInstanceOf[etwlogs]
  @scala.inline
  def fluentd: fluentd = "fluentd".asInstanceOf[fluentd]
  @scala.inline
  def gelf: gelf = "gelf".asInstanceOf[gelf]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def journald: journald = "journald".asInstanceOf[journald]
  @scala.inline
  def `json-file`: `json-file` = "json-file".asInstanceOf[`json-file`]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def rprivate: rprivate = "rprivate".asInstanceOf[rprivate]
  @scala.inline
  def rshared: rshared = "rshared".asInstanceOf[rshared]
  @scala.inline
  def rslave: rslave = "rslave".asInstanceOf[rslave]
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
  @scala.inline
  def splunk: splunk = "splunk".asInstanceOf[splunk]
  @scala.inline
  def syslog: syslog = "syslog".asInstanceOf[syslog]
  @scala.inline
  def tmpfs: tmpfs = "tmpfs".asInstanceOf[tmpfs]
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
}

