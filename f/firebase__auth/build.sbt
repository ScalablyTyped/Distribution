organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.20.11-55f175"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-517873",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-90f9cd",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-5c1025",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-14f95c",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-123b63",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
